package taxi.service.service;

import java.util.Optional;
import taxi.service.dao.DriverDao;
import taxi.service.lib.Inject;
import taxi.service.lib.Service;
import taxi.service.lib.exception.AuthenticationException;
import taxi.service.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverDao.findByLogin(login);

        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationException("Login or password was incorrect");
    }
}

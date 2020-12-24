package nl.danman85;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Class to test some things for defining new custom
 * sourcesets in Gradle
 */
public class SourceSetsTest {

    @Test
    public void whenRun_ThenSuccess() {
        final SourceSetsObject underTest = new SourceSetsObject("user", "password");

        assertThat(underTest.getUser(), is("user"));
        assertThat(underTest.getPassword(), is("password"));
    }

    // Class for testing purpose only
    private final class SourceSetsObject {
        private String user;
        private String password;

        public SourceSetsObject(String user, String password) {
            this.user = user;
            this.password = password;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}

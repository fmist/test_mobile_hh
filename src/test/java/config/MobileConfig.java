package config;
import org.aeonbits.owner.Config;
@Config.Sources(
        {"classpath:mobile.properties"}
)
public interface MobileConfig extends Config {
    @Key("mobile.url")
    String getUrl();

    @Key("mobile.path")
    String getPath();

    @Key("browserstack.user")
    String getUser();

    @Key("browserstack.key")
    String getKey();

    @Key("project")
    String getProject();

    @Key("build")
    String getBuild();

    @Key("browserstack.debug")
    boolean debug();

    @Key("device")
    String getDevice();

    @Key("os_version")
    String getVersion();

    @Key("name")
    String getName();

    @Key("browserstack.networkLogs")
    boolean logs();
}

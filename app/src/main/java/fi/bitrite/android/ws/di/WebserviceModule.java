package fi.bitrite.android.ws.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import fi.bitrite.android.ws.api.ServiceFactory;
import fi.bitrite.android.ws.api.WarmshowersWebservice;
import fi.bitrite.android.ws.api.interceptors.DefaultInterceptor;

@Module
public class WebserviceModule {
    @Provides
    @Named("WSBaseUrl")
    String provideWSBaseUrl() {
        return "https://www.warmshowers.org/";
    }

    @Provides
    WarmshowersWebservice provideWarmshowersWebservice(@Named("WSBaseUrl") String baseUrl,
                                                       DefaultInterceptor defaultInterceptor) {
        return ServiceFactory.createWarmshowersWebservice(baseUrl, defaultInterceptor);
    }
}

package org.baxter_academy.step;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                                    .setDefaultFontPath("fonts/Proxima Nova Light.otf")
                                    .setFontAttrId(R.attr.fontPath)
                                    .build()
            );
    }
}

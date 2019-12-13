package debug;

import com.billy.cc.core.component.CC;

/**
 * Created by Jiang on 2018/7/19. 11:29
 * mail:jiangwei_android@163.com
 */
public class Application extends android.app.Application {



    @Override
    public void onCreate() {
        super.onCreate();
        CC.enableVerboseLog(true);
        CC.enableDebug(true);
        CC.enableRemoteCC(true);
    }
}

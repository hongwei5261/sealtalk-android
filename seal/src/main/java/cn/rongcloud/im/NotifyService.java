package cn.rongcloud.im;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/**
 * Created by weihong on 18-2-2.
 */

public class NotifyService extends NotificationListenerService {


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onListenerConnected() {

    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {

    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
    }
}
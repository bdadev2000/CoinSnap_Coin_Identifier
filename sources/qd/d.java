package qd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.appevents.g;

/* loaded from: classes4.dex */
public final class d extends BroadcastReceiver {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i10 = 2;
        switch (this.a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        i10 = 1;
                    } else if (intExtra != 1) {
                        return;
                    }
                    c6.c.f2628c = i10;
                    return;
                }
                return;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra2 = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra2 == 0) {
                        i10 = 1;
                    } else if (intExtra2 != 1) {
                        return;
                    }
                    g.f10942g = i10;
                    return;
                }
                return;
        }
    }
}

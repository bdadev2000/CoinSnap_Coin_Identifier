package U5;

import F2.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import g4.AbstractC2292b;

/* loaded from: classes3.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3343a;

    public /* synthetic */ c(int i9) {
        this.f3343a = i9;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f3343a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        h.b = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            h.b = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra2 = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra2 == 0) {
                        AbstractC2292b.f20428a = 1;
                        return;
                    } else {
                        if (intExtra2 == 1) {
                            AbstractC2292b.f20428a = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }
}

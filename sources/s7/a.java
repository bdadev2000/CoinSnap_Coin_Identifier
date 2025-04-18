package s7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class a extends BroadcastReceiver implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f24252b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f24253c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.manager.r f24254d;

    public a(com.bumptech.glide.manager.r rVar, Handler handler, f0 f0Var) {
        this.f24254d = rVar;
        this.f24253c = handler;
        this.f24252b = f0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f24253c.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24254d.f9743d) {
            this.f24252b.f24350b.P(-1, 3, false);
        }
    }
}

package ug;

import android.app.KeyguardManager;
import android.content.Intent;
import com.plantcare.ai.identifier.plantid.ui.component.ring.NotifyFullScreenActivity;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;

/* loaded from: classes4.dex */
public final class e extends KeyguardManager.KeyguardDismissCallback {
    public final /* synthetic */ NotifyFullScreenActivity a;

    public e(NotifyFullScreenActivity notifyFullScreenActivity) {
        this.a = notifyFullScreenActivity;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        super.onDismissSucceeded();
        NotifyFullScreenActivity notifyFullScreenActivity = this.a;
        int i10 = NotifyFullScreenActivity.f16716k;
        notifyFullScreenActivity.getClass();
        Intent intent = new Intent(notifyFullScreenActivity, (Class<?>) SplashActivity.class);
        intent.setFlags(268468224);
        notifyFullScreenActivity.startActivity(intent);
        notifyFullScreenActivity.finish();
    }
}

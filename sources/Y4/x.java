package Y4;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ RemoteConfigManager b;

    public /* synthetic */ x(RemoteConfigManager remoteConfigManager) {
        this.b = remoteConfigManager;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        RemoteConfigManager.a(this.b, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        RemoteConfigManager.b(this.b, (Boolean) obj);
    }
}

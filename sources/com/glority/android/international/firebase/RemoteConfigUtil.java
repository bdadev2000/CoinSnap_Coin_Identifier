package com.glority.android.international.firebase;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.android.core.app.AppContext;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteConfigUtil.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/android/international/firebase/RemoteConfigUtil;", "", "()V", "initIfNeeded", "", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class RemoteConfigUtil {
    public static final RemoteConfigUtil INSTANCE = new RemoteConfigUtil();

    private RemoteConfigUtil() {
    }

    public final void initIfNeeded() {
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("APPLICATION_ID"), "cn.danatech.xingseus")) {
            FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance()");
            firebaseRemoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(43200L).build());
            firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener() { // from class: com.glority.android.international.firebase.RemoteConfigUtil$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    RemoteConfigUtil.initIfNeeded$lambda$0(task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initIfNeeded$lambda$0(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccessful()) {
            Log.d("FBRemoteConfig", "Config params updated: " + ((Boolean) it.getResult()) + InstructionFileId.DOT);
        } else {
            Log.d("FBRemoteConfig", "Fetch Config failed.");
        }
    }
}

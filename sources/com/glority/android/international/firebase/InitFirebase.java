package com.glority.android.international.firebase;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.init.InitTask;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InitFirebase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/glority/android/international/firebase/InitFirebase;", "Lcom/glority/android/core/init/InitTask;", "()V", "advertisingId", "", "grade", "", "getGrade", "()I", "preconditions", "", "getPreconditions", "()Ljava/util/List;", "run", "", "Companion", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class InitFirebase implements InitTask {
    public static final String KEY_PUSH_CHANNEL = "KEY_PUSH_CHANNEL";
    private String advertisingId;

    @Override // com.glority.android.core.init.InitTask
    public int getGrade() {
        return 1;
    }

    @Override // com.glority.android.core.init.InitTask
    public List<InitTask> getPreconditions() {
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.e("Glority", "init firebase");
        FirebaseApp.initializeApp(AppContext.INSTANCE.peekContext().getApplicationContext());
        if (!"".equals(AppContext.INSTANCE.getConfig(KEY_PUSH_CHANNEL))) {
            FirebaseMessaging.getInstance().subscribeToTopic(AppContext.INSTANCE.getConfig(KEY_PUSH_CHANNEL));
        }
        RemoteConfigUtil.INSTANCE.initIfNeeded();
        AdUtil.INSTANCE.init();
    }
}

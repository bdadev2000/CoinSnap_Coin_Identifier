package com.glority.android.detection;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.init.InitTask;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PreInstallTfTask.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/glority/android/detection/PreInstallTfTask;", "Lcom/glority/android/core/init/InitTask;", "()V", "grade", "", "getGrade", "()I", "preconditions", "", "getPreconditions", "()Ljava/util/List;", "run", "", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final class PreInstallTfTask implements InitTask {
    @Override // com.glority.android.core.init.InitTask
    public int getGrade() {
        return 2;
    }

    @Override // com.glority.android.core.init.InitTask
    public List<InitTask> getPreconditions() {
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new PreInstallTfTask$run$1(null), 3, null);
    }
}

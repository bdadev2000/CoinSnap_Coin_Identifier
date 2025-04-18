package okhttp3.internal.concurrent;

import q0.a;

/* loaded from: classes3.dex */
public final class TaskQueue$execute$1 extends Task {
    final /* synthetic */ a $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z2, a aVar) {
        super(str, z2);
        this.$block = aVar;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.$block.invoke();
        return -1L;
    }
}

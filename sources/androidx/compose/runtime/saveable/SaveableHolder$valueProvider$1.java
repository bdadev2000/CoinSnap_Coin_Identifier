package androidx.compose.runtime.saveable;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
final class SaveableHolder$valueProvider$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableHolder f14503a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableHolder$valueProvider$1(SaveableHolder saveableHolder) {
        super(0);
        this.f14503a = saveableHolder;
    }

    @Override // q0.a
    public final Object invoke() {
        SaveableHolder saveableHolder = this.f14503a;
        Saver saver = saveableHolder.f14497a;
        Object obj = saveableHolder.d;
        if (obj != null) {
            return saver.a(saveableHolder, obj);
        }
        throw new IllegalArgumentException("Value should be initialized".toString());
    }
}

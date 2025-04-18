package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class RememberSaveableKt$rememberSaveable$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableHolder f14492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Saver f14493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f14494c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object[] f14496g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1$1(SaveableHolder saveableHolder, Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        super(0);
        this.f14492a = saveableHolder;
        this.f14493b = saver;
        this.f14494c = saveableStateRegistry;
        this.d = str;
        this.f14495f = obj;
        this.f14496g = objArr;
    }

    @Override // q0.a
    public final Object invoke() {
        boolean z2;
        SaveableHolder saveableHolder = this.f14492a;
        SaveableStateRegistry saveableStateRegistry = saveableHolder.f14498b;
        SaveableStateRegistry saveableStateRegistry2 = this.f14494c;
        boolean z3 = true;
        if (saveableStateRegistry != saveableStateRegistry2) {
            saveableHolder.f14498b = saveableStateRegistry2;
            z2 = true;
        } else {
            z2 = false;
        }
        String str = saveableHolder.f14499c;
        String str2 = this.d;
        if (p0.a.g(str, str2)) {
            z3 = z2;
        } else {
            saveableHolder.f14499c = str2;
        }
        saveableHolder.f14497a = this.f14493b;
        saveableHolder.d = this.f14495f;
        saveableHolder.f14500f = this.f14496g;
        SaveableStateRegistry.Entry entry = saveableHolder.f14501g;
        if (entry != null && z3) {
            entry.unregister();
            saveableHolder.f14501g = null;
            saveableHolder.b();
        }
        return b0.f30125a;
    }
}

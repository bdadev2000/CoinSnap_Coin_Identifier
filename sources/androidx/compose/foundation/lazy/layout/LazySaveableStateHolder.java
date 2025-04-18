package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {

    /* renamed from: a, reason: collision with root package name */
    public final SaveableStateRegistry f4861a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4862b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f4863c;

    /* renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SaveableStateRegistry f4866a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SaveableStateRegistry saveableStateRegistry) {
            super(1);
            this.f4866a = saveableStateRegistry;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            SaveableStateRegistry saveableStateRegistry = this.f4866a;
            return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.a(obj) : true);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, Map map) {
        ParcelableSnapshotMutableState f2;
        this.f4861a = SaveableStateRegistryKt.a(map, new AnonymousClass1(saveableStateRegistry));
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f4862b = f2;
        this.f4863c = new LinkedHashSet();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean a(Object obj) {
        return this.f4861a.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final SaveableStateRegistry.Entry b(String str, a aVar) {
        return this.f4861a.b(str, aVar);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void c(Object obj) {
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) this.f4862b.getValue();
        if (saveableStateHolder == null) {
            throw new IllegalArgumentException("null wrappedHolder".toString());
        }
        saveableStateHolder.c(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map d() {
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) this.f4862b.getValue();
        if (saveableStateHolder != null) {
            Iterator it = this.f4863c.iterator();
            while (it.hasNext()) {
                saveableStateHolder.c(it.next());
            }
        }
        return this.f4861a.d();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object e(String str) {
        return this.f4861a.e(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void f(Object obj, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-697180401);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(this) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            SaveableStateHolder saveableStateHolder = (SaveableStateHolder) this.f4862b.getValue();
            if (saveableStateHolder == null) {
                throw new IllegalArgumentException("null wrappedHolder".toString());
            }
            saveableStateHolder.f(obj, pVar, g2, (i3 & 112) | (i3 & 14));
            boolean w = g2.w(this) | g2.w(obj);
            Object u2 = g2.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new LazySaveableStateHolder$SaveableStateProvider$2$1(this, obj);
                g2.o(u2);
            }
            EffectsKt.c(obj, (l) u2, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LazySaveableStateHolder$SaveableStateProvider$3(this, obj, pVar, i2);
        }
    }
}

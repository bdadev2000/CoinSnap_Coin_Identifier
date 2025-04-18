package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import d0.b0;
import java.util.LinkedHashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final SaverKt$Saver$1 d;

    /* renamed from: a, reason: collision with root package name */
    public final Map f14504a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14505b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public SaveableStateRegistry f14506c;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public final class RegistryHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Object f14512a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f14513b = true;

        /* renamed from: c, reason: collision with root package name */
        public final SaveableStateRegistry f14514c;

        public RegistryHolder(SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
            this.f14512a = obj;
            Map map = (Map) saveableStateHolderImpl.f14504a.get(obj);
            SaveableStateHolderImpl$RegistryHolder$registry$1 saveableStateHolderImpl$RegistryHolder$registry$1 = new SaveableStateHolderImpl$RegistryHolder$registry$1(saveableStateHolderImpl);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.f14529a;
            this.f14514c = new SaveableStateRegistryImpl(map, saveableStateHolderImpl$RegistryHolder$registry$1);
        }
    }

    static {
        SaveableStateHolderImpl$Companion$Saver$1 saveableStateHolderImpl$Companion$Saver$1 = SaveableStateHolderImpl$Companion$Saver$1.f14510a;
        SaveableStateHolderImpl$Companion$Saver$2 saveableStateHolderImpl$Companion$Saver$2 = SaveableStateHolderImpl$Companion$Saver$2.f14511a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f14531a;
        d = new SaverKt$Saver$1(saveableStateHolderImpl$Companion$Saver$2, saveableStateHolderImpl$Companion$Saver$1);
    }

    public SaveableStateHolderImpl(Map map) {
        this.f14504a = map;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void c(Object obj) {
        RegistryHolder registryHolder = (RegistryHolder) this.f14505b.get(obj);
        if (registryHolder != null) {
            registryHolder.f14513b = false;
        } else {
            this.f14504a.remove(obj);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void f(Object obj, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1198538093);
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
            g2.x(obj);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                SaveableStateRegistry saveableStateRegistry = this.f14506c;
                if (saveableStateRegistry != null && !saveableStateRegistry.a(obj)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                u2 = new RegistryHolder(this, obj);
                g2.o(u2);
            }
            RegistryHolder registryHolder = (RegistryHolder) u2;
            CompositionLocalKt.a(SaveableStateRegistryKt.f14529a.c(registryHolder.f14514c), pVar, g2, (i3 & 112) | 8);
            b0 b0Var = b0.f30125a;
            boolean w = g2.w(this) | g2.w(obj) | g2.w(registryHolder);
            Object u3 = g2.u();
            if (w || u3 == composer$Companion$Empty$1) {
                u3 = new SaveableStateHolderImpl$SaveableStateProvider$1$1$1(registryHolder, this, obj);
                g2.o(u3);
            }
            EffectsKt.c(b0Var, (l) u3, g2);
            g2.s();
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SaveableStateHolderImpl$SaveableStateProvider$2(this, obj, pVar, i2);
        }
    }
}

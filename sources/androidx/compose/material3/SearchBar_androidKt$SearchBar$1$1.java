package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$1$1", f = "SearchBar.android.kt", l = {Opcodes.ATHROW}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SearchBar_androidKt$SearchBar$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f10951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10952c;
    public final /* synthetic */ MutableFloatState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableState f10953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutableState f10954g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$1$1(Animatable animatable, boolean z2, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, g gVar) {
        super(2, gVar);
        this.f10951b = animatable;
        this.f10952c = z2;
        this.d = mutableFloatState;
        this.f10953f = mutableState;
        this.f10954g = mutableState2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SearchBar_androidKt$SearchBar$1$1(this.f10951b, this.f10952c, this.d, this.f10953f, this.f10954g, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchBar_androidKt$SearchBar$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f10950a;
        boolean z2 = this.f10952c;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f10951b;
            TweenSpec tweenSpec = (((Number) animatable.d()).floatValue() <= 0.0f || ((Number) animatable.d()).floatValue() >= 1.0f) ? z2 ? SearchBar_androidKt.f10901i : SearchBar_androidKt.f10902j : SearchBar_androidKt.f10903k;
            float f2 = z2 ? 1.0f : 0.0f;
            if (((Number) animatable.d()).floatValue() != f2) {
                Animatable animatable2 = this.f10951b;
                Float f3 = new Float(f2);
                this.f10950a = 1;
                if (Animatable.c(animatable2, f3, tweenSpec, null, null, this, 12) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        if (!z2) {
            this.d.n(Float.NaN);
            this.f10953f.setValue(null);
            this.f10954g.setValue(null);
        }
        return b0.f30125a;
    }
}

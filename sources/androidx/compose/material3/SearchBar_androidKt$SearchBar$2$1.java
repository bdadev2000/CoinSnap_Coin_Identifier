package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.internal.PredictiveBack_androidKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import d0.b0;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1", f = "SearchBar.android.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchBar_androidKt$SearchBar$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10955a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutatorMutex f10957c;
    public final /* synthetic */ MutableFloatState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Animatable f10958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f10959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutableState f10960h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MutableState f10961i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1", f = "SearchBar.android.kt", l = {205, 216}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SearchBar_androidKt$SearchBar$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements l {

        /* renamed from: a, reason: collision with root package name */
        public int f10962a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f10963b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f10964c;
        public final /* synthetic */ Animatable d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l f10965f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MutableState f10966g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ MutableState f10967h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableFloatState mutableFloatState, h hVar, Animatable animatable, l lVar, MutableState mutableState, MutableState mutableState2, g gVar) {
            super(1, gVar);
            this.f10963b = mutableFloatState;
            this.f10964c = hVar;
            this.d = animatable;
            this.f10965f = lVar;
            this.f10966g = mutableState;
            this.f10967h = mutableState2;
        }

        @Override // j0.a
        public final g create(g gVar) {
            return new AnonymousClass1(this.f10963b, this.f10964c, this.d, this.f10965f, this.f10966g, this.f10967h, gVar);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((g) obj)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f10962a;
            final Animatable animatable = this.d;
            final MutableState mutableState = this.f10967h;
            final MutableState mutableState2 = this.f10966g;
            MutableFloatState mutableFloatState = this.f10963b;
            try {
            } catch (CancellationException unused) {
                Animatable animatable2 = this.d;
                Float f2 = new Float(1.0f);
                TweenSpec tweenSpec = SearchBar_androidKt.f10903k;
                this.f10962a = 2;
                if (Animatable.c(animatable2, f2, tweenSpec, null, null, this, 12) == aVar) {
                    return aVar;
                }
            }
            if (i2 == 0) {
                q.m(obj);
                mutableFloatState.n(Float.NaN);
                h hVar = this.f10964c;
                e1.i iVar = new e1.i() { // from class: androidx.compose.material3.SearchBar_androidKt.SearchBar.2.1.1.1
                    @Override // e1.i
                    public final Object emit(Object obj2, g gVar) {
                        BackEventCompat backEventCompat = (BackEventCompat) obj2;
                        MutableState mutableState3 = MutableState.this;
                        if (mutableState3.getValue() == null) {
                            mutableState3.setValue(backEventCompat);
                        }
                        mutableState.setValue(backEventCompat);
                        Object e = animatable.e(new Float(1 - PredictiveBack_androidKt.f13030a.b(backEventCompat.f135c)), gVar);
                        return e == i0.a.f30806a ? e : b0.f30125a;
                    }
                };
                this.f10962a = 1;
                if (hVar.collect(iVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                    mutableFloatState.n(Float.NaN);
                    mutableState2.setValue(null);
                    mutableState.setValue(null);
                    return b0.f30125a;
                }
                q.m(obj);
            }
            mutableFloatState.n(((Number) animatable.d()).floatValue());
            this.f10965f.invoke(Boolean.FALSE);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$2$1(MutatorMutex mutatorMutex, MutableFloatState mutableFloatState, Animatable animatable, l lVar, MutableState mutableState, MutableState mutableState2, g gVar) {
        super(2, gVar);
        this.f10957c = mutatorMutex;
        this.d = mutableFloatState;
        this.f10958f = animatable;
        this.f10959g = lVar;
        this.f10960h = mutableState;
        this.f10961i = mutableState2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SearchBar_androidKt$SearchBar$2$1 searchBar_androidKt$SearchBar$2$1 = new SearchBar_androidKt$SearchBar$2$1(this.f10957c, this.d, this.f10958f, this.f10959g, this.f10960h, this.f10961i, gVar);
        searchBar_androidKt$SearchBar$2$1.f10956b = obj;
        return searchBar_androidKt$SearchBar$2$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchBar_androidKt$SearchBar$2$1) create((h) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f10955a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, (h) this.f10956b, this.f10958f, this.f10959g, this.f10960h, this.f10961i, null);
            this.f10955a = 1;
            if (this.f10957c.b(MutatePriority.f2811a, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}

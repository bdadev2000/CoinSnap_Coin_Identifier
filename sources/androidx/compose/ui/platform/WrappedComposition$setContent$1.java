package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import com.cooldev.gba.emulator.gameboy.R;
import d0.b0;
import java.util.Set;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class WrappedComposition$setContent$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WrappedComposition f16690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.p f16691b;

    /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements q0.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WrappedComposition f16692a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0.p f16693b;

        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        final class AnonymousClass3 extends r implements q0.p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ WrappedComposition f16698a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0.p f16699b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(WrappedComposition wrappedComposition, q0.p pVar) {
                super(2);
                this.f16698a = wrappedComposition;
                this.f16699b = pVar;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                    composer.A();
                } else {
                    AndroidCompositionLocals_androidKt.a(this.f16698a.f16686a, this.f16699b, composer, 0);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WrappedComposition wrappedComposition, q0.p pVar) {
            super(2);
            this.f16692a = wrappedComposition;
            this.f16693b = pVar;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                WrappedComposition wrappedComposition = this.f16692a;
                Object tag = wrappedComposition.f16686a.getTag(R.id.inspection_slot_table_set);
                Set set = (tag instanceof Set) && (!(tag instanceof r0.a) || (tag instanceof r0.f)) ? (Set) tag : null;
                AndroidComposeView androidComposeView = wrappedComposition.f16686a;
                if (set == null) {
                    Object parent = androidComposeView.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                    set = (!(tag2 instanceof Set) || ((tag2 instanceof r0.a) && !(tag2 instanceof r0.f))) ? null : (Set) tag2;
                }
                if (set != null) {
                    set.add(composer.v());
                    composer.q();
                }
                boolean w = composer.w(wrappedComposition);
                Object u2 = composer.u();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
                if (w || u2 == composer$Companion$Empty$1) {
                    u2 = new WrappedComposition$setContent$1$1$1$1(wrappedComposition, null);
                    composer.o(u2);
                }
                EffectsKt.f(androidComposeView, (q0.p) u2, composer);
                boolean w2 = composer.w(wrappedComposition);
                Object u3 = composer.u();
                if (w2 || u3 == composer$Companion$Empty$1) {
                    u3 = new WrappedComposition$setContent$1$1$2$1(wrappedComposition, null);
                    composer.o(u3);
                }
                EffectsKt.f(androidComposeView, (q0.p) u3, composer);
                CompositionLocalKt.a(InspectionTablesKt.f14653a.c(set), ComposableLambdaKt.c(-1193460702, new AnonymousClass3(wrappedComposition, this.f16693b), composer), composer, 56);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1(WrappedComposition wrappedComposition, q0.p pVar) {
        super(1);
        this.f16690a = wrappedComposition;
        this.f16691b = pVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AndroidComposeView.ViewTreeOwners viewTreeOwners = (AndroidComposeView.ViewTreeOwners) obj;
        WrappedComposition wrappedComposition = this.f16690a;
        if (!wrappedComposition.f16688c) {
            Lifecycle lifecycle = viewTreeOwners.f16240a.getLifecycle();
            q0.p pVar = this.f16691b;
            wrappedComposition.f16689f = pVar;
            if (wrappedComposition.d == null) {
                wrappedComposition.d = lifecycle;
                lifecycle.a(wrappedComposition);
            } else if (lifecycle.b().compareTo(Lifecycle.State.f19989c) >= 0) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(wrappedComposition, pVar);
                Object obj2 = ComposableLambdaKt.f14482a;
                wrappedComposition.f16687b.d(new ComposableLambdaImpl(-2000640158, anonymousClass1, true));
            }
        }
        return b0.f30125a;
    }
}

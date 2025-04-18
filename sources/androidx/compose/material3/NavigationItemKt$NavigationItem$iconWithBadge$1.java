package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavigationItemKt$NavigationItem$iconWithBadge$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f10259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10260b;

    /* renamed from: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f10261a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar) {
            super(3);
            this.f10261a = pVar;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Composer composer = (Composer) obj2;
            if ((((Number) obj3).intValue() & 17) == 16 && composer.i()) {
                composer.A();
            } else {
                this.f10261a.invoke(composer, 0);
            }
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f10262a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(p pVar) {
            super(3);
            this.f10262a = pVar;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Composer composer = (Composer) obj2;
            if ((((Number) obj3).intValue() & 17) == 16 && composer.i()) {
                composer.A();
            } else {
                this.f10262a.invoke(composer, 6);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$NavigationItem$iconWithBadge$1(p pVar, ComposableLambdaImpl composableLambdaImpl) {
        super(2);
        this.f10259a = pVar;
        this.f10260b = composableLambdaImpl;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            BadgeKt.a(ComposableLambdaKt.c(870803363, new AnonymousClass1(this.f10259a), composer), null, ComposableLambdaKt.c(-1365557663, new AnonymousClass2(this.f10260b), composer), composer, 390, 2);
        }
        return b0.f30125a;
    }
}

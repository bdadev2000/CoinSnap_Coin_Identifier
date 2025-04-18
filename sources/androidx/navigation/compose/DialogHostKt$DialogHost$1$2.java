package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogNavigator;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DialogHostKt$DialogHost$1$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f20554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogNavigator f20555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f20556c;
    public final /* synthetic */ SnapshotStateList d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DialogNavigator.Destination f20557f;

    /* renamed from: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DialogNavigator.Destination f20561a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NavBackStackEntry f20562b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DialogNavigator.Destination destination, NavBackStackEntry navBackStackEntry) {
            super(2);
            this.f20561a = destination;
            this.f20562b = navBackStackEntry;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                this.f20561a.f20575m.invoke(this.f20562b, composer, 0);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$2(NavBackStackEntry navBackStackEntry, DialogNavigator dialogNavigator, SaveableStateHolder saveableStateHolder, SnapshotStateList snapshotStateList, DialogNavigator.Destination destination) {
        super(2);
        this.f20554a = navBackStackEntry;
        this.f20555b = dialogNavigator;
        this.f20556c = saveableStateHolder;
        this.d = snapshotStateList;
        this.f20557f = destination;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            NavBackStackEntry navBackStackEntry = this.f20554a;
            boolean w = composer.w(navBackStackEntry);
            DialogNavigator dialogNavigator = this.f20555b;
            boolean I = w | composer.I(dialogNavigator);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new DialogHostKt$DialogHost$1$2$1$1(this.d, navBackStackEntry, dialogNavigator);
                composer.o(u2);
            }
            EffectsKt.c(navBackStackEntry, (l) u2, composer);
            NavBackStackEntryProviderKt.a(navBackStackEntry, this.f20556c, ComposableLambdaKt.c(-497631156, new AnonymousClass2(this.f20557f, navBackStackEntry), composer), composer, 384);
        }
        return b0.f30125a;
    }
}

package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ContextMenuUi_androidKt$ContextMenuPopup$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuColors f2979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f2980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f2981c;

    /* renamed from: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f2982a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContextMenuColors f2983b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, ContextMenuColors contextMenuColors) {
            super(3);
            this.f2982a = lVar;
            this.f2983b = contextMenuColors;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Composer composer = (Composer) obj2;
            if ((((Number) obj3).intValue() & 17) == 16 && composer.i()) {
                composer.A();
            } else {
                Object u2 = composer.u();
                if (u2 == Composer.Companion.f13690a) {
                    u2 = new ContextMenuScope();
                    composer.o(u2);
                }
                ContextMenuScope contextMenuScope = (ContextMenuScope) u2;
                contextMenuScope.f2936a.clear();
                this.f2982a.invoke(contextMenuScope);
                contextMenuScope.a(this.f2983b, composer, 0);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuUi_androidKt$ContextMenuPopup$2(ContextMenuColors contextMenuColors, Modifier modifier, l lVar) {
        super(2);
        this.f2979a = contextMenuColors;
        this.f2980b = modifier;
        this.f2981c = lVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            ContextMenuColors contextMenuColors = this.f2979a;
            ContextMenuUi_androidKt.a(contextMenuColors, this.f2980b, ComposableLambdaKt.c(1156688164, new AnonymousClass1(this.f2981c, contextMenuColors), composer), composer, 384, 0);
        }
        return b0.f30125a;
    }
}

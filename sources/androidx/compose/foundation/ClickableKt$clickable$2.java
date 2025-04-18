package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.internal.r;
import q0.a;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ClickableKt$clickable$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Role f2635c;
    public final /* synthetic */ a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$2(boolean z2, String str, Role role, a aVar) {
        super(3);
        this.f2633a = z2;
        this.f2634b = str;
        this.f2635c = role;
        this.d = aVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableInteractionSource mutableInteractionSource;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-756081143);
        Indication indication = (Indication) composer.K(IndicationKt.f2752a);
        if (indication instanceof IndicationNodeFactory) {
            composer.J(617140216);
            composer.D();
            mutableInteractionSource = null;
        } else {
            composer.J(617248189);
            Object u2 = composer.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = InteractionSourceKt.a();
                composer.o(u2);
            }
            mutableInteractionSource = (MutableInteractionSource) u2;
            composer.D();
        }
        Modifier a2 = ClickableKt.a(Modifier.Companion.f14687a, mutableInteractionSource, indication, this.f2633a, this.f2634b, this.f2635c, this.d);
        composer.D();
        return a2;
    }
}

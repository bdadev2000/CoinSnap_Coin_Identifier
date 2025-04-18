package sg;

import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderDeleteActivity;
import kf.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReminderDeleteActivity f25086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ReminderDeleteActivity reminderDeleteActivity, int i10) {
        super(0);
        this.f25085b = i10;
        this.f25086c = reminderDeleteActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f25085b) {
            case 0:
                m1772invoke();
                return Unit.INSTANCE;
            case 1:
                m1772invoke();
                return Unit.INSTANCE;
            default:
                m1772invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1772invoke() {
        int i10 = this.f25085b;
        ReminderDeleteActivity reminderDeleteActivity = this.f25086c;
        switch (i10) {
            case 0:
                ((k0) reminderDeleteActivity.n()).f20803v.setActivated(true);
                return;
            case 1:
                ((k0) reminderDeleteActivity.n()).f20803v.setActivated(false);
                return;
            default:
                int i11 = ReminderDeleteActivity.f16713l;
                TextView btnDelete = ((k0) reminderDeleteActivity.n()).f20802t;
                Intrinsics.checkNotNullExpressionValue(btnDelete, "btnDelete");
                com.bumptech.glide.e.V(btnDelete);
                return;
        }
    }
}

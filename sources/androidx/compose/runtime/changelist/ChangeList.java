package androidx.compose.runtime.changelist;

import androidx.compose.foundation.text.input.a;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ChangeList extends OperationsDebugStringFormattable {

    /* renamed from: a, reason: collision with root package name */
    public final Operations f14080a = new Operations();

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final String a(String str) {
        StringBuilder q2 = a.q("ChangeList instance containing ");
        Operations operations = this.f14080a;
        q2.append(operations.f14131b);
        q2.append(" operations");
        if (q2.length() > 0) {
            q2.append(":\n");
            q2.append(operations.a(str));
        }
        String sb = q2.toString();
        p0.a.r(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    public final void b(Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
        this.f14080a.d(applier, slotWriter, rememberManager);
    }
}

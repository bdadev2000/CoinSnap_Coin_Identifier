package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FixupList extends OperationsDebugStringFormattable {

    /* renamed from: a, reason: collision with root package name */
    public final Operations f14091a = new Operations();

    /* renamed from: b, reason: collision with root package name */
    public final Operations f14092b = new Operations();

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FixupList instance containing ");
        Operations operations = this.f14091a;
        sb2.append(operations.f14131b);
        sb2.append(" operations");
        sb.append(sb2.toString());
        if (sb.length() > 0) {
            sb.append(":\n" + operations.a(str));
        }
        String sb3 = sb.toString();
        a.r(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}

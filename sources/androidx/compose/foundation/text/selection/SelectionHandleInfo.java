package androidx.compose.foundation.text.selection;

import android.support.v4.media.d;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;

@StabilityInferred
/* loaded from: classes4.dex */
public final class SelectionHandleInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Handle f7182a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7183b;

    /* renamed from: c, reason: collision with root package name */
    public final SelectionHandleAnchor f7184c;
    public final boolean d;

    public SelectionHandleInfo(Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z2) {
        this.f7182a = handle;
        this.f7183b = j2;
        this.f7184c = selectionHandleAnchor;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.f7182a == selectionHandleInfo.f7182a && Offset.d(this.f7183b, selectionHandleInfo.f7183b) && this.f7184c == selectionHandleInfo.f7184c && this.d == selectionHandleInfo.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f7184c.hashCode() + d.d(this.f7183b, this.f7182a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f7182a);
        sb.append(", position=");
        sb.append((Object) Offset.m(this.f7183b));
        sb.append(", anchor=");
        sb.append(this.f7184c);
        sb.append(", visible=");
        return d.s(sb, this.d, ')');
    }
}

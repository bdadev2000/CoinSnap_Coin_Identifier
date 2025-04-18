package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import b1.f0;
import d0.p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Pending {

    /* renamed from: a, reason: collision with root package name */
    public final List f13850a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13851b;

    /* renamed from: c, reason: collision with root package name */
    public int f13852c;
    public final ArrayList d;
    public final MutableIntObjectMap e;

    /* renamed from: f, reason: collision with root package name */
    public final p f13853f;

    public Pending(ArrayList arrayList, int i2) {
        this.f13850a = arrayList;
        this.f13851b = i2;
        if (!(i2 >= 0)) {
            PreconditionsKt.a("Invalid start index");
            throw null;
        }
        this.d = new ArrayList();
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap();
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            KeyInfo keyInfo = (KeyInfo) this.f13850a.get(i4);
            int i5 = keyInfo.f13820c;
            int i6 = keyInfo.d;
            mutableIntObjectMap.i(i5, new GroupInfo(i4, i3, i6));
            i3 += i6;
        }
        this.e = mutableIntObjectMap;
        this.f13853f = f0.t(new Pending$keyMap$2(this));
    }

    public final boolean a(int i2, int i3) {
        int i4;
        MutableIntObjectMap mutableIntObjectMap = this.e;
        GroupInfo groupInfo = (GroupInfo) mutableIntObjectMap.c(i2);
        if (groupInfo == null) {
            return false;
        }
        int i5 = groupInfo.f13801b;
        int i6 = i3 - groupInfo.f13802c;
        groupInfo.f13802c = i3;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = mutableIntObjectMap.f1441c;
        long[] jArr = mutableIntObjectMap.f1439a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j2 = jArr[i7];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j2) < 128) {
                        GroupInfo groupInfo2 = (GroupInfo) objArr[(i7 << 3) + i9];
                        if (groupInfo2.f13801b >= i5 && !p0.a.g(groupInfo2, groupInfo) && (i4 = groupInfo2.f13801b + i6) >= 0) {
                            groupInfo2.f13801b = i4;
                        }
                    }
                    j2 >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}

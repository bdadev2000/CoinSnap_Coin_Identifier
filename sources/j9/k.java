package j9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public final class k implements a9.h {

    /* renamed from: b, reason: collision with root package name */
    public final List f19859b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f19860c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f19861d;

    public k(ArrayList arrayList) {
        this.f19859b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f19860c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f19860c;
            jArr[i11] = cVar.f19835b;
            jArr[i11 + 1] = cVar.f19836c;
        }
        long[] jArr2 = this.f19860c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f19861d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // a9.h
    public final List getCues(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.f19859b;
            if (i10 >= list.size()) {
                break;
            }
            int i11 = i10 * 2;
            long[] jArr = this.f19860c;
            if (jArr[i11] <= j3 && j3 < jArr[i11 + 1]) {
                c cVar = (c) list.get(i10);
                a9.b bVar = cVar.a;
                if (bVar.f369g == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new k0.b(8));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            a9.b bVar2 = ((c) arrayList2.get(i12)).a;
            bVar2.getClass();
            a9.a aVar = new a9.a(bVar2);
            aVar.f346e = (-1) - i12;
            aVar.f347f = 1;
            arrayList.add(aVar.a());
        }
        return arrayList;
    }

    @Override // a9.h
    public final long getEventTime(int i10) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        long[] jArr = this.f19861d;
        if (i10 >= jArr.length) {
            z11 = false;
        }
        u0.d(z11);
        return jArr[i10];
    }

    @Override // a9.h
    public final int getEventTimeCount() {
        return this.f19861d.length;
    }

    @Override // a9.h
    public final int getNextEventTimeIndex(long j3) {
        long[] jArr = this.f19861d;
        int b3 = h0.b(jArr, j3, false);
        if (b3 >= jArr.length) {
            return -1;
        }
        return b3;
    }
}

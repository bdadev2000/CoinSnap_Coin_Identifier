package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.LongSparseArrayKt;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ViewInfoStore {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f21174a = new SimpleArrayMap();

    /* renamed from: b, reason: collision with root package name */
    public final LongSparseArray f21175b = new LongSparseArray();

    /* loaded from: classes2.dex */
    public static class InfoRecord {
        public static final Pools.SimplePool d = new Pools.SimplePool(20);

        /* renamed from: a, reason: collision with root package name */
        public int f21176a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.ItemAnimator.ItemHolderInfo f21177b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.ItemAnimator.ItemHolderInfo f21178c;

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.recyclerview.widget.ViewInfoStore$InfoRecord] */
        public static InfoRecord a() {
            InfoRecord infoRecord = (InfoRecord) d.b();
            return infoRecord == null ? new Object() : infoRecord;
        }
    }

    /* loaded from: classes2.dex */
    public interface ProcessCallback {
        void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void b(RecyclerView.ViewHolder viewHolder);

        void c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    public final void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        SimpleArrayMap simpleArrayMap = this.f21174a;
        InfoRecord infoRecord = (InfoRecord) simpleArrayMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.a();
            simpleArrayMap.put(viewHolder, infoRecord);
        }
        infoRecord.f21178c = itemHolderInfo;
        infoRecord.f21176a |= 8;
    }

    public final RecyclerView.ItemAnimator.ItemHolderInfo b(RecyclerView.ViewHolder viewHolder, int i2) {
        InfoRecord infoRecord;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        SimpleArrayMap simpleArrayMap = this.f21174a;
        int e = simpleArrayMap.e(viewHolder);
        if (e >= 0 && (infoRecord = (InfoRecord) simpleArrayMap.k(e)) != null) {
            int i3 = infoRecord.f21176a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                infoRecord.f21176a = i4;
                if (i2 == 4) {
                    itemHolderInfo = infoRecord.f21177b;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = infoRecord.f21178c;
                }
                if ((i4 & 12) == 0) {
                    simpleArrayMap.i(e);
                    infoRecord.f21176a = 0;
                    infoRecord.f21177b = null;
                    infoRecord.f21178c = null;
                    InfoRecord.d.a(infoRecord);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.f21174a.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.f21176a &= -2;
    }

    public final void d(RecyclerView.ViewHolder viewHolder) {
        LongSparseArray longSparseArray = this.f21175b;
        int j2 = longSparseArray.j() - 1;
        while (true) {
            if (j2 < 0) {
                break;
            }
            if (viewHolder == longSparseArray.k(j2)) {
                Object[] objArr = longSparseArray.f1468c;
                Object obj = objArr[j2];
                Object obj2 = LongSparseArrayKt.f1469a;
                if (obj != obj2) {
                    objArr[j2] = obj2;
                    longSparseArray.f1466a = true;
                }
            } else {
                j2--;
            }
        }
        InfoRecord infoRecord = (InfoRecord) this.f21174a.remove(viewHolder);
        if (infoRecord != null) {
            infoRecord.f21176a = 0;
            infoRecord.f21177b = null;
            infoRecord.f21178c = null;
            InfoRecord.d.a(infoRecord);
        }
    }
}

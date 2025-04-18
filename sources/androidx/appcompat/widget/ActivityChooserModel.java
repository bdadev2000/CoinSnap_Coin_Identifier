package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
class ActivityChooserModel extends DataSetObservable {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f910h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f911i = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Object f912a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f913b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f914c = new ArrayList();
    public final ActivitySorter d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f915f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f916g;

    /* loaded from: classes2.dex */
    public interface ActivityChooserModelClient {
    }

    /* loaded from: classes2.dex */
    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        @Override // java.lang.Comparable
        public final int compareTo(ActivityResolveInfo activityResolveInfo) {
            activityResolveInfo.getClass();
            return Float.floatToIntBits(0.0f) - Float.floatToIntBits(0.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ActivityResolveInfo.class != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f);
        }

        public final int hashCode() {
            return Float.floatToIntBits(0.0f) + 31;
        }

        public final String toString() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public interface ActivitySorter {
    }

    /* loaded from: classes2.dex */
    public static final class DefaultSorter implements ActivitySorter {
        public DefaultSorter() {
            new HashMap();
        }
    }

    /* loaded from: classes2.dex */
    public static final class HistoricalRecord {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f917a;

        /* renamed from: b, reason: collision with root package name */
        public final long f918b;

        /* renamed from: c, reason: collision with root package name */
        public final float f919c;

        public HistoricalRecord(ComponentName componentName, long j2, float f2) {
            this.f917a = componentName;
            this.f918b = j2;
            this.f919c = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = historicalRecord.f917a;
            ComponentName componentName2 = this.f917a;
            if (componentName2 == null) {
                if (componentName != null) {
                    return false;
                }
            } else if (!componentName2.equals(componentName)) {
                return false;
            }
            return this.f918b == historicalRecord.f918b && Float.floatToIntBits(this.f919c) == Float.floatToIntBits(historicalRecord.f919c);
        }

        public final int hashCode() {
            ComponentName componentName = this.f917a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j2 = this.f918b;
            return Float.floatToIntBits(this.f919c) + ((((hashCode + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }

        public final String toString() {
            return "[; activity:" + this.f917a + "; time:" + this.f918b + "; weight:" + new BigDecimal(this.f919c) + "]";
        }
    }

    /* loaded from: classes2.dex */
    public interface OnChooseActivityListener {
    }

    /* loaded from: classes2.dex */
    public final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        @Override // android.os.AsyncTask
        public final Void doInBackground(Object[] objArr) {
            throw null;
        }
    }

    public ActivityChooserModel() {
        new DefaultSorter();
        this.e = 50;
        this.f915f = true;
        this.f916g = true;
        throw null;
    }

    public static ActivityChooserModel b() {
        ActivityChooserModel activityChooserModel;
        synchronized (f910h) {
            try {
                activityChooserModel = (ActivityChooserModel) f911i.get(null);
                if (activityChooserModel == null) {
                    new ActivityChooserModel();
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activityChooserModel;
    }

    public final void a() {
        if (this.f915f && this.f916g && !TextUtils.isEmpty(null)) {
            this.f915f = false;
            throw null;
        }
        e();
    }

    public final int c() {
        int size;
        synchronized (this.f912a) {
            a();
            size = this.f913b.size();
        }
        return size;
    }

    public final ResolveInfo d() {
        synchronized (this.f912a) {
            try {
                a();
                if (this.f913b.isEmpty()) {
                    return null;
                }
                ((ActivityResolveInfo) this.f913b.get(0)).getClass();
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f914c;
        int size = arrayList.size() - this.e;
        if (size <= 0) {
            return;
        }
        this.f916g = true;
        for (int i2 = 0; i2 < size; i2++) {
        }
    }
}

package androidx.compose.ui.text.intl;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.ArrayList;

@StabilityInferred
@RequiresApi
/* loaded from: classes4.dex */
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {

    /* renamed from: a, reason: collision with root package name */
    public android.os.LocaleList f17397a;

    /* renamed from: b, reason: collision with root package name */
    public LocaleList f17398b;

    /* renamed from: c, reason: collision with root package name */
    public final SynchronizedObject f17399c = new Object();

    public final LocaleList a() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (this.f17399c) {
            LocaleList localeList2 = this.f17398b;
            if (localeList2 != null && localeList == this.f17397a) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new Locale(localeList.get(i2)));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.f17397a = localeList;
            this.f17398b = localeList3;
            return localeList3;
        }
    }
}

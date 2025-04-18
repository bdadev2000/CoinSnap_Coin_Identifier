package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi
/* loaded from: classes3.dex */
final class LocaleListPlatformWrapper implements LocaleListInterface {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f18615a;

    public LocaleListPlatformWrapper(Object obj) {
        this.f18615a = (LocaleList) obj;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final String a() {
        return this.f18615a.toLanguageTags();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Object b() {
        return this.f18615a;
    }

    public final boolean equals(Object obj) {
        return this.f18615a.equals(((LocaleListInterface) obj).b());
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Locale get(int i2) {
        return this.f18615a.get(i2);
    }

    public final int hashCode() {
        return this.f18615a.hashCode();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final boolean isEmpty() {
        return this.f18615a.isEmpty();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final int size() {
        return this.f18615a.size();
    }

    public final String toString() {
        return this.f18615a.toString();
    }
}

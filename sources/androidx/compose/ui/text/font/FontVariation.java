package androidx.compose.ui.text.font;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import e0.t;
import e0.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FontVariation {

    @Immutable
    /* loaded from: classes3.dex */
    public interface Setting {
        void a();

        float b(Density density);

        void c();
    }

    @Immutable
    /* loaded from: classes3.dex */
    public static final class SettingFloat implements Setting {
        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final void a() {
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float b(Density density) {
            return 0.0f;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final void c() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            settingFloat.getClass();
            if (!a.g(null, null)) {
                return false;
            }
            settingFloat.getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FontVariation.Setting(axisName='null', value=0.0)";
        }
    }

    @Immutable
    /* loaded from: classes3.dex */
    public static final class SettingInt implements Setting {
        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final void a() {
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float b(Density density) {
            return 0;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final void c() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            settingInt.getClass();
            if (!a.g(null, null)) {
                return false;
            }
            settingInt.getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FontVariation.Setting(axisName='null', value=0)";
        }
    }

    @Immutable
    /* loaded from: classes3.dex */
    public static final class SettingTextUnit implements Setting {
        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final void a() {
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float b(Density density) {
            if (density == null) {
                throw new IllegalArgumentException("density must not be null".toString());
            }
            return density.x1() * TextUnit.c(0L);
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final void c() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            settingTextUnit.getClass();
            if (!a.g(null, null)) {
                return false;
            }
            settingTextUnit.getClass();
            return TextUnit.a(0L, 0L);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FontVariation.Setting(axisName='null', value=" + ((Object) TextUnit.d(0L)) + ')';
        }
    }

    @Immutable
    /* loaded from: classes3.dex */
    public static final class Settings {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f17262a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17263b;

        public Settings(Setting... settingArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Setting setting : settingArr) {
                setting.c();
                Object obj = linkedHashMap.get(null);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(null, obj);
                }
                ((List) obj).add(setting);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(d.q(d.v("'", str, "' must be unique. Actual [ ["), u.K0(list, null, null, null, null, 63), ']').toString());
                }
                t.t0(arrayList, list);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f17262a = arrayList2;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Setting) arrayList2.get(i2)).a();
            }
            this.f17263b = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Settings) && a.g(this.f17262a, ((Settings) obj).f17262a);
        }

        public final int hashCode() {
            return this.f17262a.hashCode();
        }
    }
}

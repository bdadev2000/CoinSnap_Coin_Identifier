package a4;

import java.util.ArrayList;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import qc.s0;

/* loaded from: classes.dex */
public final class s {
    public final ArrayList a;

    public s(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new r(optJSONObject));
                }
            }
        }
        this.a = arrayList;
    }

    public void a(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        s0.e(name);
        s0.f(value, name);
        c(name, value);
    }

    public void b(String line) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(line, "line");
        indexOf$default = StringsKt__StringsKt.indexOf$default(line, AbstractJsonLexerKt.COLON, 1, false, 4, (Object) null);
        if (indexOf$default != -1) {
            String substring = line.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = line.substring(indexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            c(substring, substring2);
            return;
        }
        if (line.charAt(0) == ':') {
            String substring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
            c("", substring3);
            return;
        }
        c("", line);
    }

    public void c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = this.a;
        arrayList.add(name);
        arrayList.add(StringsKt.trim((CharSequence) value).toString());
    }

    public wh.z d() {
        Object[] array = this.a.toArray(new String[0]);
        if (array != null) {
            return new wh.z((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public String e(String name) {
        boolean equals;
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 2;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
        if (progressionLastElement > size) {
            return null;
        }
        while (true) {
            int i10 = size - 2;
            equals = StringsKt__StringsJVMKt.equals(name, (String) arrayList.get(size), true);
            if (equals) {
                return (String) arrayList.get(size + 1);
            }
            if (size != progressionLastElement) {
                size = i10;
            } else {
                return null;
            }
        }
    }

    public void f(String name) {
        boolean equals;
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                equals = StringsKt__StringsJVMKt.equals(name, (String) arrayList.get(i10), true);
                if (equals) {
                    arrayList.remove(i10);
                    arrayList.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ s(int i10) {
        if (i10 != 2) {
            this.a = new ArrayList();
        } else {
            this.a = new ArrayList();
        }
    }

    public s() {
        this.a = new ArrayList(20);
    }
}

package xg;

import android.util.SparseBooleanArray;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class a {
    public static String a(SparseBooleanArray sparseBooleanArray) {
        if (sparseBooleanArray == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseBooleanArray.keyAt(i10);
            jSONArray.put(new JSONArray().put(keyAt).put(sparseBooleanArray.get(keyAt) ? 1 : 0));
        }
        return jSONArray.toString();
    }

    public static String b(List list) {
        String e2 = new n().e(list);
        Intrinsics.checkNotNullExpressionValue(e2, "toJson(...)");
        return e2;
    }

    public static SparseBooleanArray c(String str) {
        boolean z10;
        boolean z11;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            int i11 = jSONArray2.getInt(0);
            if (jSONArray2.getInt(1) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            sparseBooleanArray.put(i11, z11);
        }
        return sparseBooleanArray;
    }

    public static List d(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Object b3 = new n().b(value, new TypeToken(new TypeToken<List<? extends String>>() { // from class: com.plantcare.ai.identifier.plantid.utils.Converters$toStringList$listType$1
        }.f12123b));
        Intrinsics.checkNotNullExpressionValue(b3, "fromJson(...)");
        return CollectionsKt.toList((Iterable) b3);
    }
}

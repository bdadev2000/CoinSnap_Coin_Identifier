package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.a;

/* loaded from: classes.dex */
public final class ParameterComponent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String PARAMETER_NAME_KEY = "name";

    @NotNull
    private static final String PARAMETER_PATH_KEY = "path";

    @NotNull
    private static final String PARAMETER_VALUE_KEY = "value";

    @NotNull
    private final String name;

    @NotNull
    private final List<PathComponent> path;

    @NotNull
    private final String pathType;

    @NotNull
    private final String value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public ParameterComponent(@NotNull JSONObject jSONObject) {
        int length;
        a.s(jSONObject, "component");
        String string = jSONObject.getString("name");
        a.r(string, "component.getString(PARAMETER_NAME_KEY)");
        this.name = string;
        String optString = jSONObject.optString("value");
        a.r(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.value = optString;
        String optString2 = jSONObject.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
        a.r(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.pathType = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(PARAMETER_PATH_KEY);
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                a.r(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new PathComponent(jSONObject2));
                if (i3 >= length) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        this.path = arrayList;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<PathComponent> getPath() {
        return this.path;
    }

    @NotNull
    public final String getPathType() {
        return this.pathType;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

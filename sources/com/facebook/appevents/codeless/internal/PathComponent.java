package com.facebook.appevents.codeless.internal;

import java.util.Arrays;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p0.a;

/* loaded from: classes3.dex */
public final class PathComponent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String PATH_CLASS_NAME_KEY = "class_name";

    @NotNull
    private static final String PATH_DESCRIPTION_KEY = "description";

    @NotNull
    private static final String PATH_HINT_KEY = "hint";

    @NotNull
    private static final String PATH_ID_KEY = "id";

    @NotNull
    private static final String PATH_INDEX_KEY = "index";

    @NotNull
    private static final String PATH_MATCH_BITMASK_KEY = "match_bitmask";

    @NotNull
    private static final String PATH_TAG_KEY = "tag";

    @NotNull
    private static final String PATH_TEXT_KEY = "text";

    @NotNull
    private final String className;

    @NotNull
    private final String description;

    @NotNull
    private final String hint;
    private final int id;
    private final int index;
    private final int matchBitmask;

    @NotNull
    private final String tag;

    @NotNull
    private final String text;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        MatchBitmaskType(int i2) {
            this.value = i2;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static MatchBitmaskType[] valuesCustom() {
            MatchBitmaskType[] valuesCustom = values();
            return (MatchBitmaskType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(@NotNull JSONObject jSONObject) {
        a.s(jSONObject, "component");
        String string = jSONObject.getString(PATH_CLASS_NAME_KEY);
        a.r(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.className = string;
        this.index = jSONObject.optInt("index", -1);
        this.id = jSONObject.optInt("id");
        String optString = jSONObject.optString("text");
        a.r(optString, "component.optString(PATH_TEXT_KEY)");
        this.text = optString;
        String optString2 = jSONObject.optString("tag");
        a.r(optString2, "component.optString(PATH_TAG_KEY)");
        this.tag = optString2;
        String optString3 = jSONObject.optString("description");
        a.r(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.description = optString3;
        String optString4 = jSONObject.optString("hint");
        a.r(optString4, "component.optString(PATH_HINT_KEY)");
        this.hint = optString4;
        this.matchBitmask = jSONObject.optInt(PATH_MATCH_BITMASK_KEY);
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    public final int getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMatchBitmask() {
        return this.matchBitmask;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }
}

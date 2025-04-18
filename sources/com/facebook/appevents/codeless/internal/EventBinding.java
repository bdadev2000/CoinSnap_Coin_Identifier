package com.facebook.appevents.codeless.internal;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.a;

/* loaded from: classes2.dex */
public final class EventBinding {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String activityName;

    @NotNull
    private final String appVersion;

    @NotNull
    private final String componentId;

    @NotNull
    private final String eventName;

    @NotNull
    private final MappingMethod method;

    @NotNull
    private final List<ParameterComponent> parameters;

    @NotNull
    private final List<PathComponent> path;

    @NotNull
    private final String pathType;

    @NotNull
    private final ActionType type;

    /* loaded from: classes2.dex */
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            ActionType[] valuesCustom = values();
            return (ActionType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final EventBinding getInstanceFromJson(@NotNull JSONObject jSONObject) throws JSONException, IllegalArgumentException {
            int length;
            a.s(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString(FirebaseAnalytics.Param.METHOD);
            a.r(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            a.r(locale, ViewHierarchyConstants.ENGLISH);
            String upperCase = string2.toUpperCase(locale);
            a.r(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            MappingMethod valueOf = MappingMethod.valueOf(upperCase);
            String string3 = jSONObject.getString(StatsEvent.f29841z);
            a.r(string3, "mapping.getString(\"event_type\")");
            a.r(locale, ViewHierarchyConstants.ENGLISH);
            String upperCase2 = string3.toUpperCase(locale);
            a.r(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            ActionType valueOf2 = ActionType.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i2 = 0;
            if (length2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    a.r(jSONObject2, "jsonPath");
                    arrayList.add(new PathComponent(jSONObject2));
                    if (i4 >= length2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            String optString = jSONObject.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i5 = i2 + 1;
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                    a.r(jSONObject3, "jsonParameter");
                    arrayList2.add(new ParameterComponent(jSONObject3));
                    if (i5 >= length) {
                        break;
                    }
                    i2 = i5;
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            a.r(string, "eventName");
            a.r(string4, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
            a.r(optString2, "componentId");
            a.r(optString, "pathType");
            a.r(optString3, "activityName");
            return new EventBinding(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }

        @NotNull
        public final List<EventBinding> parseArray(@Nullable JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            a.r(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(getInstanceFromJson(jSONObject));
                            if (i3 >= length) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public enum MappingMethod {
        MANUAL,
        INFERENCE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static MappingMethod[] valuesCustom() {
            MappingMethod[] valuesCustom = values();
            return (MappingMethod[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public EventBinding(@NotNull String str, @NotNull MappingMethod mappingMethod, @NotNull ActionType actionType, @NotNull String str2, @NotNull List<PathComponent> list, @NotNull List<ParameterComponent> list2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        a.s(str, "eventName");
        a.s(mappingMethod, FirebaseAnalytics.Param.METHOD);
        a.s(actionType, "type");
        a.s(str2, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        a.s(list, "path");
        a.s(list2, "parameters");
        a.s(str3, "componentId");
        a.s(str4, "pathType");
        a.s(str5, "activityName");
        this.eventName = str;
        this.method = mappingMethod;
        this.type = actionType;
        this.appVersion = str2;
        this.path = list;
        this.parameters = list2;
        this.componentId = str3;
        this.pathType = str4;
        this.activityName = str5;
    }

    @NotNull
    public static final EventBinding getInstanceFromJson(@NotNull JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return Companion.getInstanceFromJson(jSONObject);
    }

    @NotNull
    public static final List<EventBinding> parseArray(@Nullable JSONArray jSONArray) {
        return Companion.parseArray(jSONArray);
    }

    @NotNull
    public final String getActivityName() {
        return this.activityName;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getComponentId() {
        return this.componentId;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final MappingMethod getMethod() {
        return this.method;
    }

    @NotNull
    public final String getPathType() {
        return this.pathType;
    }

    @NotNull
    public final ActionType getType() {
        return this.type;
    }

    @NotNull
    public final List<ParameterComponent> getViewParameters() {
        List<ParameterComponent> unmodifiableList = Collections.unmodifiableList(this.parameters);
        a.r(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    @NotNull
    public final List<PathComponent> getViewPath() {
        List<PathComponent> unmodifiableList = Collections.unmodifiableList(this.path);
        a.r(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}

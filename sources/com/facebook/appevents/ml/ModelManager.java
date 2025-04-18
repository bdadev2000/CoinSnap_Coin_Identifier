package com.facebook.appevents.ml;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.j;
import b1.f0;
import com.applovin.impl.sdk.z;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareInternalUtility;
import com.safedk.android.internal.h;
import e0.b0;
import e0.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.a;
import w0.g;
import z0.m;

@RestrictTo
/* loaded from: classes2.dex */
public final class ModelManager {

    @NotNull
    private static final String ASSET_URI_KEY = "asset_uri";

    @NotNull
    private static final String CACHE_KEY_MODELS = "models";

    @NotNull
    private static final String CACHE_KEY_REQUEST_TIMESTAMP = "model_request_timestamp";

    @NotNull
    private static final String MODEL_ASSERT_STORE = "com.facebook.internal.MODEL_STORE";
    public static final int MODEL_REQUEST_INTERVAL_MILLISECONDS = 259200000;

    @NotNull
    private static final String MTML_USE_CASE = "MTML";

    @NotNull
    private static final String RULES_URI_KEY = "rules_uri";

    @NotNull
    private static final String THRESHOLD_KEY = "thresholds";

    @NotNull
    private static final String USE_CASE_KEY = "use_case";

    @NotNull
    private static final String VERSION_ID_KEY = "version_id";

    @NotNull
    public static final ModelManager INSTANCE = new ModelManager();

    @NotNull
    private static final Map<String, TaskHandler> taskHandlers = new ConcurrentHashMap();

    @NotNull
    private static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = f0.v("other", AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, AppEventsConstants.EVENT_NAME_ADDED_TO_CART, AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT);

    @NotNull
    private static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = f0.v(IntegrityManager.INTEGRITY_TYPE_NONE, "address", IntegrityManager.INTEGRITY_TYPE_HEALTH);

    /* loaded from: classes2.dex */
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Task.valuesCustom().length];
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Task[] valuesCustom() {
            Task[] valuesCustom = values();
            return (Task[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @NotNull
        public final String toKey() {
            int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                return "integrity_detect";
            }
            if (i2 == 2) {
                return "app_event_pred";
            }
            throw new RuntimeException();
        }

        @NotNull
        public final String toUseCase() {
            int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i2 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new RuntimeException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class TaskHandler {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private String assetUri;

        @Nullable
        private Model model;

        @Nullable
        private Runnable onPostExecute;

        @Nullable
        private File ruleFile;

        @Nullable
        private String ruleUri;

        @Nullable
        private float[] thresholds;

        @NotNull
        private String useCase;
        private int versionId;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public static /* synthetic */ void a(List list, File file) {
                m483execute$lambda1(list, file);
            }

            private final void deleteOldFiles(String str, int i2) {
                File[] listFiles;
                File mlDir = Utils.getMlDir();
                if (mlDir == null || (listFiles = mlDir.listFiles()) == null || listFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i2;
                int length = listFiles.length;
                int i3 = 0;
                while (i3 < length) {
                    File file = listFiles[i3];
                    i3++;
                    String name = file.getName();
                    a.r(name, "name");
                    if (m.q1(name, str, false) && !m.q1(name, str2, false)) {
                        file.delete();
                    }
                }
            }

            private final void download(String str, String str2, FileDownloadTask.Callback callback) {
                File file = new File(Utils.getMlDir(), str2);
                if (str == null || file.exists()) {
                    callback.onComplete(file);
                } else {
                    new FileDownloadTask(str, file, callback).execute(new String[0]);
                }
            }

            /* renamed from: execute$lambda-1 */
            public static final void m483execute$lambda1(List list, File file) {
                a.s(list, "$slaves");
                a.s(file, ShareInternalUtility.STAGING_PARAM);
                Model build = Model.Companion.build(file);
                if (build != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        TaskHandler taskHandler = (TaskHandler) it.next();
                        TaskHandler.Companion.download(taskHandler.getRuleUri(), taskHandler.getUseCase() + '_' + taskHandler.getVersionId() + "_rule", new androidx.privacysandbox.ads.adservices.java.internal.a(2, taskHandler, build));
                    }
                }
            }

            /* renamed from: execute$lambda-1$lambda-0 */
            public static final void m484execute$lambda1$lambda0(TaskHandler taskHandler, Model model, File file) {
                a.s(taskHandler, "$slave");
                a.s(file, ShareInternalUtility.STAGING_PARAM);
                taskHandler.setModel(model);
                taskHandler.setRuleFile(file);
                Runnable runnable = taskHandler.onPostExecute;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            @Nullable
            public final TaskHandler build(@Nullable JSONObject jSONObject) {
                String string;
                String string2;
                String optString;
                int i2;
                float[] access$parseJsonArray;
                if (jSONObject != null) {
                    try {
                        string = jSONObject.getString(ModelManager.USE_CASE_KEY);
                        string2 = jSONObject.getString(ModelManager.ASSET_URI_KEY);
                        optString = jSONObject.optString(ModelManager.RULES_URI_KEY, null);
                        i2 = jSONObject.getInt(ModelManager.VERSION_ID_KEY);
                        access$parseJsonArray = ModelManager.access$parseJsonArray(ModelManager.INSTANCE, jSONObject.getJSONArray(ModelManager.THRESHOLD_KEY));
                        a.r(string, "useCase");
                        a.r(string2, "assetUri");
                    } catch (Exception unused) {
                        return null;
                    }
                }
                return new TaskHandler(string, string2, optString, i2, access$parseJsonArray);
            }

            public final void execute(@NotNull TaskHandler taskHandler) {
                a.s(taskHandler, "handler");
                execute(taskHandler, f0.u(taskHandler));
            }

            public final void execute(@NotNull TaskHandler taskHandler, @NotNull List<TaskHandler> list) {
                a.s(taskHandler, h.f29971a);
                a.s(list, "slaves");
                deleteOldFiles(taskHandler.getUseCase(), taskHandler.getVersionId());
                download(taskHandler.getAssetUri(), taskHandler.getUseCase() + '_' + taskHandler.getVersionId(), new j(list, 2));
            }
        }

        public TaskHandler(@NotNull String str, @NotNull String str2, @Nullable String str3, int i2, @Nullable float[] fArr) {
            a.s(str, "useCase");
            a.s(str2, "assetUri");
            this.useCase = str;
            this.assetUri = str2;
            this.ruleUri = str3;
            this.versionId = i2;
            this.thresholds = fArr;
        }

        @NotNull
        public final String getAssetUri() {
            return this.assetUri;
        }

        @Nullable
        public final Model getModel() {
            return this.model;
        }

        @Nullable
        public final File getRuleFile() {
            return this.ruleFile;
        }

        @Nullable
        public final String getRuleUri() {
            return this.ruleUri;
        }

        @Nullable
        public final float[] getThresholds() {
            return this.thresholds;
        }

        @NotNull
        public final String getUseCase() {
            return this.useCase;
        }

        public final int getVersionId() {
            return this.versionId;
        }

        public final void setAssetUri(@NotNull String str) {
            a.s(str, "<set-?>");
            this.assetUri = str;
        }

        public final void setModel(@Nullable Model model) {
            this.model = model;
        }

        @NotNull
        public final TaskHandler setOnPostExecute(@Nullable Runnable runnable) {
            this.onPostExecute = runnable;
            return this;
        }

        public final void setRuleFile(@Nullable File file) {
            this.ruleFile = file;
        }

        public final void setRuleUri(@Nullable String str) {
            this.ruleUri = str;
        }

        public final void setThresholds(@Nullable float[] fArr) {
            this.thresholds = fArr;
        }

        public final void setUseCase(@NotNull String str) {
            a.s(str, "<set-?>");
            this.useCase = str;
        }

        public final void setVersionId(int i2) {
            this.versionId = i2;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Task.valuesCustom().length];
            iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ModelManager() {
    }

    public static final /* synthetic */ float[] access$parseJsonArray(ModelManager modelManager, JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.parseJsonArray(jSONArray);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final void addModels(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    TaskHandler build = TaskHandler.Companion.build(jSONObject.getJSONObject(keys.next()));
                    if (build != null) {
                        taskHandlers.put(build.getUseCase(), build);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            Utility.runOnNonUiThread(new z(12));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: all -> 0x002c, Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, all -> 0x002c, blocks: (B:6:0x000d, B:8:0x001f, B:11:0x0026, B:12:0x0033, B:14:0x0043, B:16:0x0049, B:18:0x0071, B:21:0x0051, B:24:0x005a, B:25:0x002e), top: B:5:0x000d }] */
    /* renamed from: enable$lambda-0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m480enable$lambda0() {
        /*
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            java.lang.Class<com.facebook.appevents.ml.ModelManager> r2 = com.facebook.appevents.ml.ModelManager.class
            boolean r3 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            android.content.Context r3 = com.facebook.FacebookSdk.getApplicationContext()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            java.lang.String r4 = "com.facebook.internal.MODEL_STORE"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r4 = 0
            java.lang.String r4 = r3.getString(r1, r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 == 0) goto L2e
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r5 != 0) goto L26
            goto L2e
        L26:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            goto L33
        L2c:
            r0 = move-exception
            goto L7a
        L2e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r5.<init>()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
        L33:
            r6 = 0
            long r6 = r3.getLong(r0, r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            com.facebook.internal.FeatureManager r4 = com.facebook.internal.FeatureManager.INSTANCE     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            com.facebook.internal.FeatureManager$Feature r4 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            boolean r4 = com.facebook.internal.FeatureManager.isEnabled(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 == 0) goto L51
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 == 0) goto L51
            com.facebook.appevents.ml.ModelManager r4 = com.facebook.appevents.ml.ModelManager.INSTANCE     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            boolean r4 = r4.isValidTimestamp(r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 != 0) goto L71
        L51:
            com.facebook.appevents.ml.ModelManager r4 = com.facebook.appevents.ml.ModelManager.INSTANCE     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            org.json.JSONObject r5 = r4.fetchModels()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r5 != 0) goto L5a
            return
        L5a:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r3)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r0.apply()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
        L71:
            com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.ml.ModelManager.INSTANCE     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r0.addModels(r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r0.enableMTML()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            goto L7d
        L7a:
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r0, r2)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.ModelManager.m480enable$lambda0():void");
    }

    private final void enableMTML() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i2 = 0;
            for (Map.Entry<String, TaskHandler> entry : taskHandlers.entrySet()) {
                String key = entry.getKey();
                TaskHandler value = entry.getValue();
                if (a.g(key, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    String assetUri = value.getAssetUri();
                    int max = Math.max(i2, value.getVersionId());
                    FeatureManager featureManager = FeatureManager.INSTANCE;
                    if (FeatureManager.isEnabled(FeatureManager.Feature.SuggestedEvents) && isLocaleEnglish()) {
                        arrayList.add(value.setOnPostExecute(new z(13)));
                    }
                    str = assetUri;
                    i2 = max;
                }
                if (a.g(key, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    str = value.getAssetUri();
                    i2 = Math.max(i2, value.getVersionId());
                    FeatureManager featureManager2 = FeatureManager.INSTANCE;
                    if (FeatureManager.isEnabled(FeatureManager.Feature.IntelligentIntegrity)) {
                        arrayList.add(value.setOnPostExecute(new z(14)));
                    }
                }
            }
            if (str == null || i2 <= 0 || arrayList.isEmpty()) {
                return;
            }
            TaskHandler.Companion.execute(new TaskHandler(MTML_USE_CASE, str, null, i2, null), arrayList);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* renamed from: enableMTML$lambda-1 */
    public static final void m481enableMTML$lambda1() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            SuggestedEventsManager.enable();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    /* renamed from: enableMTML$lambda-2 */
    public static final void m482enableMTML$lambda2() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            IntegrityManager.enable();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    private final JSONObject fetchModels() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String[] strArr = {USE_CASE_KEY, VERSION_ID_KEY, ASSET_URI_KEY, RULES_URI_KEY, THRESHOLD_KEY};
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, TextUtils.join(",", strArr));
            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, "app/model_asset", null);
            newGraphPathRequest.setParameters(bundle);
            JSONObject jSONObject = newGraphPathRequest.executeAndWait().getJSONObject();
            if (jSONObject == null) {
                return null;
            }
            return parseRawJsonObject(jSONObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Nullable
    public static final File getRuleFile(@NotNull Task task) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            a.s(task, "task");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler == null) {
                return null;
            }
            return taskHandler.getRuleFile();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final boolean isLocaleEnglish() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            Locale resourceLocale = Utility.getResourceLocale();
            if (resourceLocale != null) {
                String language = resourceLocale.getLanguage();
                a.r(language, "locale.language");
                if (!m.M0(language, "en", false)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isValidTimestamp(long j2) {
        if (CrashShieldHandler.isObjectCrashing(this) || j2 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j2 < 259200000;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final float[] parseJsonArray(JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    try {
                        String string = jSONArray.getString(i2);
                        a.r(string, "jsonArray.getString(i)");
                        fArr[i2] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final JSONObject parseRawJsonObject(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length <= 0) {
                    return jSONObject2;
                }
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(VERSION_ID_KEY, jSONObject3.getString(VERSION_ID_KEY));
                    jSONObject4.put(USE_CASE_KEY, jSONObject3.getString(USE_CASE_KEY));
                    jSONObject4.put(THRESHOLD_KEY, jSONObject3.getJSONArray(THRESHOLD_KEY));
                    jSONObject4.put(ASSET_URI_KEY, jSONObject3.getString(ASSET_URI_KEY));
                    if (jSONObject3.has(RULES_URI_KEY)) {
                        jSONObject4.put(RULES_URI_KEY, jSONObject3.getString(RULES_URI_KEY));
                    }
                    jSONObject2.put(jSONObject3.getString(USE_CASE_KEY), jSONObject4);
                    if (i3 >= length) {
                        return jSONObject2;
                    }
                    i2 = i3;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Nullable
    public static final String[] predict(@NotNull Task task, @NotNull float[][] fArr, @NotNull String[] strArr) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            a.s(task, "task");
            a.s(fArr, "denses");
            a.s(strArr, "texts");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            Model model = taskHandler == null ? null : taskHandler.getModel();
            if (model == null) {
                return null;
            }
            float[] thresholds = taskHandler.getThresholds();
            int length = strArr.length;
            int length2 = fArr[0].length;
            MTensor mTensor = new MTensor(new int[]{length, length2});
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    System.arraycopy(fArr[i2], 0, mTensor.getData(), i2 * length2, length2);
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            MTensor predictOnMTML = model.predictOnMTML(mTensor, strArr, task.toKey());
            if (predictOnMTML != null && thresholds != null && predictOnMTML.getData().length != 0 && thresholds.length != 0) {
                int i4 = WhenMappings.$EnumSwitchMapping$0[task.ordinal()];
                if (i4 == 1) {
                    return INSTANCE.processSuggestedEventResult(predictOnMTML, thresholds);
                }
                if (i4 == 2) {
                    return INSTANCE.processIntegrityDetectionResult(predictOnMTML, thresholds);
                }
                throw new RuntimeException();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final String[] processIntegrityDetectionResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            g F0 = a.F0(0, shape);
            ArrayList arrayList = new ArrayList(q.M(F0, 10));
            Iterator it = F0.iterator();
            while (it.hasNext()) {
                int b2 = ((b0) it).b();
                String str = IntegrityManager.INTEGRITY_TYPE_NONE;
                int length = fArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (data[(b2 * shape2) + i3] >= fArr[i2]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i3);
                    }
                    i2++;
                    i3 = i4;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final String[] processSuggestedEventResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            g F0 = a.F0(0, shape);
            ArrayList arrayList = new ArrayList(q.M(F0, 10));
            Iterator it = F0.iterator();
            while (it.hasNext()) {
                int b2 = ((b0) it).b();
                String str = "other";
                int length = fArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    if (data[(b2 * shape2) + i3] >= fArr[i2]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i3);
                    }
                    i2++;
                    i3 = i4;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}

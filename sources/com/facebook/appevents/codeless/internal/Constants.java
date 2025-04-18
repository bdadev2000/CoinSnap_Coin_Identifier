package com.facebook.appevents.codeless.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class Constants {

    @NotNull
    public static final String APP_INDEXING = "app_indexing";

    @NotNull
    public static final String APP_INDEXING_ENABLED = "is_app_indexing_enabled";
    public static final int APP_INDEXING_SCHEDULE_INTERVAL_MS = 1000;

    @NotNull
    public static final String BUTTON_SAMPLING = "button_sampling";

    @NotNull
    public static final String DEVICE_SESSION_ID = "device_session_id";

    @NotNull
    public static final String EVENT_MAPPING_PATH_TYPE_KEY = "path_type";

    @NotNull
    public static final String EXTINFO = "extinfo";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String IS_CODELESS_EVENT_KEY = "_is_fb_codeless";
    public static final int MAX_TREE_DEPTH = 25;

    @NotNull
    public static final String PATH_TYPE_ABSOLUTE = "absolute";

    @NotNull
    public static final String PATH_TYPE_RELATIVE = "relative";

    @NotNull
    public static final String PLATFORM = "android";

    private Constants() {
    }
}

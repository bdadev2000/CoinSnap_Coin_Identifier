package com.facebook.share;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public interface Sharer {

    /* loaded from: classes.dex */
    public static final class Result {

        @Nullable
        private final String postId;

        public Result(@Nullable String str) {
            this.postId = str;
        }

        @Nullable
        public final String getPostId() {
            return this.postId;
        }
    }

    boolean getShouldFailOnDataError();

    void setShouldFailOnDataError(boolean z2);
}

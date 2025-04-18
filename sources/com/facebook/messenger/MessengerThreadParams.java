package com.facebook.messenger;

import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes.dex */
public final class MessengerThreadParams {

    @NotNull
    private final String metadata;

    @NotNull
    private final Origin origin;

    @NotNull
    private final List<String> participants;

    @NotNull
    private final String threadToken;

    /* loaded from: classes.dex */
    public enum Origin {
        REPLY_FLOW,
        COMPOSE_FLOW,
        UNKNOWN;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Origin[] valuesCustom() {
            Origin[] valuesCustom = values();
            return (Origin[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public MessengerThreadParams(@NotNull Origin origin, @NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        a.s(origin, "origin");
        a.s(str, "threadToken");
        a.s(str2, "metadata");
        a.s(list, "participants");
        this.origin = origin;
        this.threadToken = str;
        this.metadata = str2;
        this.participants = list;
    }

    @NotNull
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final Origin getOrigin() {
        return this.origin;
    }

    @NotNull
    public final List<String> getParticipants() {
        return this.participants;
    }

    @NotNull
    public final String getThreadToken() {
        return this.threadToken;
    }
}

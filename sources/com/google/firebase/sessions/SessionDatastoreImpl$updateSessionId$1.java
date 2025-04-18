package com.google.firebase.sessions;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import b1.d0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.sessions.SessionDatastoreImpl;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import java.io.IOException;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {Opcodes.DUP}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SessionDatastoreImpl$updateSessionId$1 extends i implements p {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ SessionDatastoreImpl this$0;

    @e(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ String $sessionId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, g gVar) {
            super(2, gVar);
            this.$sessionId = str;
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sessionId, gVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        @Nullable
        public final Object invoke(@NotNull MutablePreferences mutablePreferences, @Nullable g gVar) {
            return ((AnonymousClass1) create(mutablePreferences, gVar)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            i0.a aVar = i0.a.f30806a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            Preferences.Key<String> session_id = SessionDatastoreImpl.FirebaseSessionDataKeys.INSTANCE.getSESSION_ID();
            String str = this.$sessionId;
            mutablePreferences.getClass();
            p0.a.s(session_id, SDKConstants.PARAM_KEY);
            mutablePreferences.d(session_id, str);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionDatastoreImpl$updateSessionId$1(SessionDatastoreImpl sessionDatastoreImpl, String str, g gVar) {
        super(2, gVar);
        this.this$0 = sessionDatastoreImpl;
        this.$sessionId = str;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new SessionDatastoreImpl$updateSessionId$1(this.this$0, this.$sessionId, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((SessionDatastoreImpl$updateSessionId$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SessionDatastoreImpl.Companion companion;
        Context context;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                q.m(obj);
                companion = SessionDatastoreImpl.Companion;
                context = this.this$0.context;
                DataStore dataStore = companion.getDataStore(context);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$sessionId, null);
                this.label = 1;
                if (PreferencesKt.a(dataStore, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
        } catch (IOException e) {
            Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e);
        }
        return b0.f30125a;
    }
}

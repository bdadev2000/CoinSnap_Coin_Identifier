package com.google.firebase.sessions.settings;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.objectweb.asm.TypeReference;
import q0.p;

@e(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {TypeReference.NEW, TypeReference.METHOD_REFERENCE, TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RemoteSettingsFetcher$doConfigFetch$2 extends i implements p {
    final /* synthetic */ Map<String, String> $headerOptions;
    final /* synthetic */ p $onFailure;
    final /* synthetic */ p $onSuccess;
    int label;
    final /* synthetic */ RemoteSettingsFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettingsFetcher$doConfigFetch$2(RemoteSettingsFetcher remoteSettingsFetcher, Map<String, String> map, p pVar, p pVar2, g gVar) {
        super(2, gVar);
        this.this$0 = remoteSettingsFetcher;
        this.$headerOptions = map;
        this.$onSuccess = pVar;
        this.$onFailure = pVar2;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.this$0, this.$headerOptions, this.$onSuccess, this.$onFailure, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        URL url;
        a aVar = a.f30806a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                q.m(obj);
                url = this.this$0.settingsUrl();
                URLConnection openConnection = url.openConnection();
                p0.a.q(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry<String, String> entry : this.$headerOptions.entrySet()) {
                    httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    p pVar = this.$onSuccess;
                    this.label = 1;
                    if (pVar.invoke(jSONObject, this) == aVar) {
                        return aVar;
                    }
                } else {
                    p pVar2 = this.$onFailure;
                    String str = "Bad response code: " + responseCode;
                    this.label = 2;
                    if (pVar2.invoke(str, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i2 == 1 || i2 == 2) {
                q.m(obj);
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
        } catch (Exception e) {
            p pVar3 = this.$onFailure;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.label = 3;
            if (pVar3.invoke(message, this) == aVar) {
                return aVar;
            }
        }
        return b0.f30125a;
    }
}

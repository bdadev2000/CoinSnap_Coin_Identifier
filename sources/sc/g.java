package sc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f24957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f24958c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f24959d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f24960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f24961g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Map map, Function2 function2, Function2 function22, Continuation continuation) {
        super(2, continuation);
        this.f24958c = hVar;
        this.f24959d = map;
        this.f24960f = function2;
        this.f24961g = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f24958c, this.f24959d, this.f24960f, this.f24961g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f24957b;
        Function2 function2 = this.f24961g;
        try {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                URLConnection openConnection = h.a(this.f24958c).openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.f24959d.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb2 = new StringBuilder();
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    while (true) {
                        ?? readLine = bufferedReader.readLine();
                        objectRef.element = readLine;
                        if (readLine == 0) {
                            break;
                        }
                        sb2.append((String) readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb2.toString());
                    Function2 function22 = this.f24960f;
                    this.f24957b = 1;
                    if (function22.invoke(jSONObject, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    String str = "Bad response code: " + responseCode;
                    this.f24957b = 2;
                    if (function2.invoke(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = e2.toString();
            }
            this.f24957b = 3;
            if (function2.invoke(message, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

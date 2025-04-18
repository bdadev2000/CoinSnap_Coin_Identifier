package com.plantcare.ai.identifier.plantid.utils.network_adapter_factory;

import androidx.core.app.NotificationCompat;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ni.c;
import ni.e;
import ni.f;
import ni.s0;
import wh.o0;
import wh.u0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapperCallAdapter;", "R", "Lni/e;", "Lni/c;", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", "Ljava/lang/reflect/Type;", "responseType", NotificationCompat.CATEGORY_CALL, "adapt", "Ljava/lang/reflect/Type;", "<init>", "(Ljava/lang/reflect/Type;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ResultWrapperCallAdapter<R> implements e {
    private final Type responseType;

    public ResultWrapperCallAdapter(Type responseType) {
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        this.responseType = responseType;
    }

    @Override // ni.e
    /* renamed from: responseType, reason: from getter */
    public Type getResponseType() {
        return this.responseType;
    }

    @Override // ni.e
    public c adapt(final c call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new c() { // from class: com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapperCallAdapter$adapt$1
            @Override // ni.c
            public void cancel() {
                c.this.cancel();
            }

            @Override // ni.c
            public c clone() {
                return this;
            }

            @Override // ni.c
            public void enqueue(final f callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                c cVar = c.this;
                final ResultWrapperCallAdapter<R> resultWrapperCallAdapter = this;
                cVar.enqueue(new f() { // from class: com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapperCallAdapter$adapt$1$enqueue$1
                    @Override // ni.f
                    public void onFailure(c call2, Throwable t5) {
                        ResultWrapper genericError;
                        Intrinsics.checkNotNullParameter(call2, "call");
                        Intrinsics.checkNotNullParameter(t5, "t");
                        if (t5 instanceof IOException) {
                            genericError = ResultWrapper.NetworkError.INSTANCE;
                        } else {
                            genericError = new ResultWrapper.GenericError(null, t5.getMessage());
                        }
                        f.this.onResponse(resultWrapperCallAdapter.adapt(call2), s0.a(genericError));
                    }

                    @Override // ni.f
                    public void onResponse(c call2, s0 response) {
                        ResultWrapper genericError;
                        Intrinsics.checkNotNullParameter(call2, "call");
                        Intrinsics.checkNotNullParameter(response, "response");
                        boolean j3 = response.a.j();
                        u0 u0Var = response.a;
                        if (j3) {
                            Object obj = response.f22877b;
                            if (obj != null) {
                                genericError = new ResultWrapper.Success(obj);
                            } else {
                                genericError = new ResultWrapper.GenericError(Integer.valueOf(u0Var.f27216f), "Empty body");
                            }
                        } else {
                            genericError = new ResultWrapper.GenericError(Integer.valueOf(u0Var.f27216f), u0Var.f27215d);
                        }
                        f.this.onResponse(resultWrapperCallAdapter.adapt(call2), s0.a(genericError));
                    }
                });
            }

            @Override // ni.c
            public boolean isCanceled() {
                return c.this.isCanceled();
            }

            @Override // ni.c
            public o0 request() {
                return c.this.request();
            }
        };
    }
}

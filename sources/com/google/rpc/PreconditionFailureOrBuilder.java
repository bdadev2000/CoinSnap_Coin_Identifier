package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.PreconditionFailure;
import java.util.List;

/* loaded from: classes5.dex */
public interface PreconditionFailureOrBuilder extends MessageLiteOrBuilder {
    PreconditionFailure.Violation getViolations(int i);

    int getViolationsCount();

    List<PreconditionFailure.Violation> getViolationsList();
}

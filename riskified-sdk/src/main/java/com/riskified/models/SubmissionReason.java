package com.riskified.models;

import com.google.gson.annotations.SerializedName;

public enum SubmissionReason {

    @SerializedName("failed_verification")
    failedVerification,
    @SerializedName("rule_decision")
    ruleDecision,
    @SerializedName("third_party")
    thirdParty,
    @SerializedName("manual_decision")
    manualDecision,
    @SerializedName("policy_decision")
    policyDecision
}

/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EmailMessageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EmailMessageMarshaller {

    private static final MarshallingInfo<String> BODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Body").build();
    private static final MarshallingInfo<String> FROMADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FromAddress").build();
    private static final MarshallingInfo<String> HTMLBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HtmlBody").build();
    private static final MarshallingInfo<Map> SUBSTITUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Substitutions").build();
    private static final MarshallingInfo<String> TEMPLATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateArn").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();

    private static final EmailMessageMarshaller instance = new EmailMessageMarshaller();

    public static EmailMessageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EmailMessage emailMessage, ProtocolMarshaller protocolMarshaller) {

        if (emailMessage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(emailMessage.getBody(), BODY_BINDING);
            protocolMarshaller.marshall(emailMessage.getFromAddress(), FROMADDRESS_BINDING);
            protocolMarshaller.marshall(emailMessage.getHtmlBody(), HTMLBODY_BINDING);
            protocolMarshaller.marshall(emailMessage.getSubstitutions(), SUBSTITUTIONS_BINDING);
            protocolMarshaller.marshall(emailMessage.getTemplateArn(), TEMPLATEARN_BINDING);
            protocolMarshaller.marshall(emailMessage.getTitle(), TITLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
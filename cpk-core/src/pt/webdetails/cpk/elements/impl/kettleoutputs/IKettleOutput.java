/*!
* Copyright 2002 - 2013 Webdetails, a Pentaho company.  All rights reserved.
*
* This software was developed by Webdetails and is provided under the terms
* of the Mozilla Public License, Version 2.0, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to  http://mozilla.org/MPL/2.0/. The Initial Developer is Webdetails.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

package pt.webdetails.cpk.elements.impl.kettleoutputs;

import org.pentaho.di.core.Result;
import org.pentaho.di.core.row.RowMetaInterface;
import pt.webdetails.cpk.elements.impl.KettleElementHelper;
import pt.webdetails.cpk.elements.impl.KettleResult;

public interface IKettleOutput {

  // TODO: remove this on reafactor and use processResult( KettleResult )
  public void processResult();

  public void processResult( KettleResult result );

  public boolean needsRowListener();

  public void storeRow( Object[] row, RowMetaInterface rowMeta );


  // can be probably replaced
  public void setResult( Result r );
  public Result getResult();

  // can be probably replaced
  public KettleElementHelper.KettleType getKettleType();
  public void setKettleType( KettleElementHelper.KettleType kettleType );

  // not needed
  public void setOutputStepName( String stepName );
  public String getOutputStepName();
}

import React, {Component} from 'react';
import { Link } from 'react-router';

class PatientProfile extends Component {
    render(){
        return(
            <div>
                Patient
                {this.props.params.id}
            </div>
        );
    }
}

export default PatientProfile